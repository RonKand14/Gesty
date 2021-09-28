import cv2
import numpy as np
import tensorflow as tf
from tensorflow import keras
from os.path import dirname, join


def predict_video(bytes1,bytes2,bytes3,bytes4,bytes5,bytes6,bytes7,bytes8,bytes9,bytes10,bytes11,bytes12,bytes13,bytes14,bytes15,bytes16,bytes17,bytes18,bytes19,bytes20,
                  bytes21,bytes22,bytes23,bytes24,bytes25,bytes26,bytes27,bytes28,bytes29,bytes30,bytes31,bytes32,bytes33,bytes34,bytes35,bytes36,bytes37,bytes38,bytes39,bytes40):
    filename = join(dirname(__file__), "Rnn_Sub_Ver3.h5")
    model_path = '/data/user/0/com.example.basicapp_ver1/files/chaquopy/AssetFinder/app/Rnn_Sub_Ver3.h5'
    model = keras.models.load_model(filename)
    x = []
    array1 = np.asarray(bytes1)
    array2 = np.asarray(bytes2)
    array3 = np.asarray(bytes3)
    array4 = np.asarray(bytes4)
    array5 = np.asarray(bytes5)
    array6 = np.asarray(bytes6)
    array7 = np.asarray(bytes7)
    array8 = np.asarray(bytes8)
    array9 = np.asarray(bytes9)
    array10 = np.asarray(bytes10)
    array11 = np.asarray(bytes11)
    array12 = np.asarray(bytes12)
    array13 = np.asarray(bytes13)
    array14 = np.asarray(bytes14)
    array15 = np.asarray(bytes15)
    array16 = np.asarray(bytes16)
    array17 = np.asarray(bytes17)
    array18 = np.asarray(bytes18)
    array19 = np.asarray(bytes19)
    array20 = np.asarray(bytes20)
    array21 = np.asarray(bytes21)
    array22 = np.asarray(bytes22)
    array23 = np.asarray(bytes23)
    array24 = np.asarray(bytes24)
    array25 = np.asarray(bytes25)
    array26 = np.asarray(bytes26)
    array27 = np.asarray(bytes27)
    array28 = np.asarray(bytes28)
    array29 = np.asarray(bytes29)
    array30 = np.asarray(bytes30)
    array31 = np.asarray(bytes31)
    array32 = np.asarray(bytes32)
    array33 = np.asarray(bytes33)
    array34 = np.asarray(bytes34)
    array35 = np.asarray(bytes35)
    array36 = np.asarray(bytes36)
    array37 = np.asarray(bytes37)
    array38 = np.asarray(bytes38)
    array39 = np.asarray(bytes39)
    array40 = np.asarray(bytes40)
    data1 = cv2.imdecode(array1, cv2.IMREAD_UNCHANGED)
    data2 = cv2.imdecode(array2, cv2.IMREAD_UNCHANGED)
    data3 = cv2.imdecode(array3, cv2.IMREAD_UNCHANGED)
    data4 = cv2.imdecode(array4, cv2.IMREAD_UNCHANGED)
    data5 = cv2.imdecode(array5, cv2.IMREAD_UNCHANGED)
    data6 = cv2.imdecode(array6, cv2.IMREAD_UNCHANGED)
    data7 = cv2.imdecode(array7, cv2.IMREAD_UNCHANGED)
    data8 = cv2.imdecode(array8, cv2.IMREAD_UNCHANGED)
    data9 = cv2.imdecode(array9, cv2.IMREAD_UNCHANGED)
    data10 = cv2.imdecode(array10, cv2.IMREAD_UNCHANGED)
    data11 = cv2.imdecode(array11, cv2.IMREAD_UNCHANGED)
    data12 = cv2.imdecode(array12, cv2.IMREAD_UNCHANGED)
    data13 = cv2.imdecode(array13, cv2.IMREAD_UNCHANGED)
    data14 = cv2.imdecode(array14, cv2.IMREAD_UNCHANGED)
    data15 = cv2.imdecode(array15, cv2.IMREAD_UNCHANGED)
    data16 = cv2.imdecode(array16, cv2.IMREAD_UNCHANGED)
    data17 = cv2.imdecode(array17, cv2.IMREAD_UNCHANGED)
    data18 = cv2.imdecode(array18, cv2.IMREAD_UNCHANGED)
    data19 = cv2.imdecode(array19, cv2.IMREAD_UNCHANGED)
    data20 = cv2.imdecode(array20, cv2.IMREAD_UNCHANGED)
    data21 = cv2.imdecode(array21, cv2.IMREAD_UNCHANGED)
    data22 = cv2.imdecode(array22, cv2.IMREAD_UNCHANGED)
    data23 = cv2.imdecode(array23, cv2.IMREAD_UNCHANGED)
    data24 = cv2.imdecode(array24, cv2.IMREAD_UNCHANGED)
    data25 = cv2.imdecode(array25, cv2.IMREAD_UNCHANGED)
    data26 = cv2.imdecode(array26, cv2.IMREAD_UNCHANGED)
    data27 = cv2.imdecode(array27, cv2.IMREAD_UNCHANGED)
    data28 = cv2.imdecode(array28, cv2.IMREAD_UNCHANGED)
    data29 = cv2.imdecode(array29, cv2.IMREAD_UNCHANGED)
    data30 = cv2.imdecode(array30, cv2.IMREAD_UNCHANGED)
    data31 = cv2.imdecode(array31, cv2.IMREAD_UNCHANGED)
    data32 = cv2.imdecode(array32, cv2.IMREAD_UNCHANGED)
    data33 = cv2.imdecode(array33, cv2.IMREAD_UNCHANGED)
    data34 = cv2.imdecode(array34, cv2.IMREAD_UNCHANGED)
    data35 = cv2.imdecode(array35, cv2.IMREAD_UNCHANGED)
    data36 = cv2.imdecode(array36, cv2.IMREAD_UNCHANGED)
    data37 = cv2.imdecode(array37, cv2.IMREAD_UNCHANGED)
    data38 = cv2.imdecode(array38, cv2.IMREAD_UNCHANGED)
    data39 = cv2.imdecode(array39, cv2.IMREAD_UNCHANGED)
    data40 = cv2.imdecode(array40, cv2.IMREAD_UNCHANGED)
    image1 = np.expand_dims(data1, axis=2)
    image2 = np.expand_dims(data2, axis=2)
    image3 = np.expand_dims(data3, axis=2)
    image4 = np.expand_dims(data4, axis=2)
    image5 = np.expand_dims(data5, axis=2)
    image6 = np.expand_dims(data6, axis=2)
    image7 = np.expand_dims(data7, axis=2)
    image8 = np.expand_dims(data8, axis=2)
    image9 = np.expand_dims(data9, axis=2)
    image10 = np.expand_dims(data10, axis=2)
    image11 = np.expand_dims(data11, axis=2)
    image12 = np.expand_dims(data12, axis=2)
    image13 = np.expand_dims(data13, axis=2)
    image14 = np.expand_dims(data14, axis=2)
    image15 = np.expand_dims(data15, axis=2)
    image16 = np.expand_dims(data16, axis=2)
    image17 = np.expand_dims(data17, axis=2)
    image18 = np.expand_dims(data18, axis=2)
    image19 = np.expand_dims(data19, axis=2)
    image20 = np.expand_dims(data20, axis=2)
    image21 = np.expand_dims(data21, axis=2)
    image22 = np.expand_dims(data22, axis=2)
    image23 = np.expand_dims(data23, axis=2)
    image24 = np.expand_dims(data24, axis=2)
    image25 = np.expand_dims(data25, axis=2)
    image26 = np.expand_dims(data26, axis=2)
    image27 = np.expand_dims(data27, axis=2)
    image28 = np.expand_dims(data28, axis=2)
    image29 = np.expand_dims(data29, axis=2)
    image30 = np.expand_dims(data30, axis=2)
    image31 = np.expand_dims(data31, axis=2)
    image32 = np.expand_dims(data32, axis=2)
    image33 = np.expand_dims(data33, axis=2)
    image34 = np.expand_dims(data34, axis=2)
    image35 = np.expand_dims(data35, axis=2)
    image36 = np.expand_dims(data36, axis=2)
    image37 = np.expand_dims(data37, axis=2)
    image38 = np.expand_dims(data38, axis=2)
    image39 = np.expand_dims(data39, axis=2)
    image40 = np.expand_dims(data40, axis=2)
    x.append(image1)
    x.append(image2)
    x.append(image3)
    x.append(image4)
    x.append(image5)
    x.append(image6)
    x.append(image7)
    x.append(image8)
    x.append(image9)
    x.append(image10)
    x.append(image11)
    x.append(image12)
    x.append(image13)
    x.append(image14)
    x.append(image15)
    x.append(image16)
    x.append(image17)
    x.append(image18)
    x.append(image19)
    x.append(image20)
    x.append(image21)
    x.append(image22)
    x.append(image23)
    x.append(image24)
    x.append(image25)
    x.append(image26)
    x.append(image27)
    x.append(image28)
    x.append(image29)
    x.append(image30)
    x.append(image31)
    x.append(image32)
    x.append(image33)
    x.append(image34)
    x.append(image35)
    x.append(image36)
    x.append(image37)
    x.append(image38)
    x.append(image39)
    x.append(image40)
    x_data = np.asarray(x)
    x_data = np.expand_dims(x_data, axis=0)
    x_data = x_data[:,:,:,:,:,0]
    x_data = x_data[0,:,:,:,:]
    sub_data = sub_frames(x_data)
    sub_data = np.expand_dims(sub_data, axis=0)
    y_pred_unknown = model.predict(sub_data)
    y_pred_unknown = np.argmax(y_pred_unknown, axis=1)
    return y_pred_unknown


def sub_frames(frames_list):
    frame_index = 0
    sub_array = []
    pixel_size = 64
    threshold_value = 40
    seq_len = 40
    while frame_index < seq_len-1:
        # Image Sub
        result = cv2.subtract(frames_list[frame_index + 1], frames_list[frame_index])
        ret, bw_img = cv2.threshold(result, threshold_value, pixel_size, cv2.THRESH_BINARY)
        output = cv2.connectedComponentsWithStats(bw_img, 4, cv2.CV_32S)  # Can assign 8 instead of 4 - cant see difference
        (numLabels, labels, stats, centroids) = output
        max_cc = [0, 0, 0, 0, 0, 0]  # CC representation --> (index,area,x,y,w,h)
        # Iterate on CC of result(the sub from the 2 images)
        for i in range(0, numLabels):
            if i > 0:
                x = stats[i, cv2.CC_STAT_LEFT]
                y = stats[i, cv2.CC_STAT_TOP]
                w = stats[i, cv2.CC_STAT_WIDTH]
                h = stats[i, cv2.CC_STAT_HEIGHT]
                area = stats[i, cv2.CC_STAT_AREA]
                (cX, cY) = centroids[i]
                # Update max CC
                if area > max_cc[1]:
                    max_cc[0] = i
                    max_cc[1] = area
                    max_cc[1] = x
                    max_cc[1] = y
                    max_cc[1] = w
                    max_cc[1] = h
                    output = result.copy()
                    cv2.rectangle(output, (x, y), (x + w, y + h), (0, pixel_size, 0), 3)
                    cv2.circle(output, (int(cX), int(cY)), 4, (0, 0, pixel_size), -1)
                    componentMask = (labels == i).astype("uint8") * pixel_size
                    max_cc_img = componentMask
                else:
                    continue
            else:
                max_cc_img = bw_img
        max_cc_img = np.expand_dims(max_cc_img, axis=2)
        sub_array.append(max_cc_img)
        frame_index = frame_index + 2
    return sub_array
